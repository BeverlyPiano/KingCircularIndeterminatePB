package xking.com.kingcircularindeterminatepb.utils;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;

public class Utils {
	
	
	/**
	 * Convert Dp to Pixel
	 */
	public static int dpToPx(float dp, Resources resources){
		float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.getDisplayMetrics());
		return (int) px;
	}

}
