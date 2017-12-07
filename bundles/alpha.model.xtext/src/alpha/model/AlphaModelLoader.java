package alpha.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

public class AlphaModelLoader {
		public static AlphaRoot loadModel(String filename) throws IOException {
			
	        final Injector injector = new AlphaStandaloneSetup().createInjectorAndDoEMFRegistration();
	        
	        final ResourceSet set = injector.getInstance(XtextResourceSet.class);
	        set.getPackageRegistry().put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
	        
	        final Resource res = set.getResource(URI.createFileURI(filename), true);

	 		EObject root = res.getContents().get(0);
	 		AlphaRoot toplevel= (AlphaRoot) root;

	 		return toplevel;
		}
		

		public static List<AlphaRoot> loadModel(Collection<File> files) throws IOException {
			
	        final Injector injector = new AlphaStandaloneSetup().createInjectorAndDoEMFRegistration();
	        
	        final ResourceSet set = injector.getInstance(XtextResourceSet.class);
	        set.getPackageRegistry().put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
	        
	        List<AlphaRoot> roots = new ArrayList<>(files.size());
	        for (File file : files) {
	        		final Resource res = set.getResource(URI.createFileURI(file.getPath()), true);
	    	 		EObject root = res.getContents().get(0);
	    	 		AlphaRoot toplevel= (AlphaRoot) root;
	    	 		roots.add(toplevel);
	        }


	 		return roots;
		}
		
		
		public static void formatFile(String filename) throws IOException {
			AlphaRoot prog = loadModel(filename);

	        final Injector injector = new AlphaStandaloneSetup().createInjectorAndDoEMFRegistration();
	        final XtextResourceSet set = injector.getInstance(XtextResourceSet.class);
	 
	        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 injector.getInstance(XtextResourceFactory.class));
	        
	        SaveOptions opt = SaveOptions.newBuilder().format().getOptions();
	        
	        XtextResource resource = (XtextResource)set.createResource(URI.createFileURI(filename));
			resource.getContents().add(prog);
			resource.save(opt.toOptionsMap());
		}

		public static void saveAsXML(AlphaRoot seq,String modelfilename) throws IOException {
	        final Injector injector = new AlphaStandaloneSetup().createInjectorAndDoEMFRegistration();
	        final ResourceSet set = injector.getInstance(XtextResourceSet.class);
	        
	        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());
	        
	        Resource resource = set.createResource(URI.createFileURI(modelfilename));
			resource.getContents().add(seq);
			resource.save(null);
		}
		
		public static List<Issue> validate(AlphaVisitable alpha) {
			Resource resource = alpha.eResource();
			IResourceValidator validator = ((XtextResource)resource).getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			return issues;
		}
	}
