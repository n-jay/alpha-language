package alpha.model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class JNIObjectUpdateListener extends EContentAdapter {

//	public static final JNIObjectUpdateListener INSTANCE = new JNIObjectUpdateListener();
//	
//	@Override
//	public void notifyChanged(Notification notification) {
//		
//		
//		
//		if (notification.getFeature() == null) {
//			super.notifyChanged(notification);
//			return;
//		}
//
//		if (!notification.getFeature().equals(ModelPackage.Literals.ALPHA_SYSTEM__PARAMETER_DOMAIN) &&
//			!notification.getFeature().equals(ModelPackage.Literals.VARIABLE_DOMAIN)) {
//			super.notifyChanged(notification);
//			return; 
//		}
//		
//		if (!(notification.getNotifier() instanceof AlphaVisitable)) {
//			super.notifyChanged(notification);
//			return;
//		}
//		
//		AlphaVisitable obj = (AlphaVisitable)notification.getNotifier();
//		obj.accept(JNIDomainCalculator.INSTANCE);
//		
//		
//		super.notifyChanged(notification);
//	}
}
