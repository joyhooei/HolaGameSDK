package com.holagames.xcds.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.holagames.xcds.IlongSDK;
import com.holagames.xcds.tools.ResUtil;

public class LyProgressDialog extends Dialog {

	private Context context;

	public LyProgressDialog(Context context) {
		super(context, ResUtil.getStyleId(context, "dialogStyle"));
		this.context = context;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if(IlongSDK.ISLONG){
			context.setTheme(ResUtil.getStyleId(context, "Ilong_Theme"));
		}else{
			context.setTheme(ResUtil.getStyleId(context, "HR_Theme"));
		}
		setContentView(ResUtil.getLayoutId(context, "ilong_progress"));
	}

}
