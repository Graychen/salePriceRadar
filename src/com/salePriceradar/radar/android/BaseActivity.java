package com.salePriceradar.radar.android;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public abstract class BaseActivity extends FragmentActivity{
	/**
	 * ��Ļ�Ŀ�ȡ��߶ȡ��ܶ�
	 */
	protected int mScreenWidth;
	protected int mScreenHeight;
	protected float mDensity;
	
	protected List<AsyncTask<Void, Void, Boolean>> mAsyncTasks = new ArrayList<AsyncTask<Void, Void, Boolean>>();
	
	/** ��ʼ����ͼ **/
	protected abstract void initViews();

	/** ��ʼ���¼� **/
	protected abstract void initEvents();
	
	/** ����Bundleͨ��Class��ת���� **/
	protected void startActivity(Class<?> cls, Bundle bundle) {
		Intent intent = new Intent();
		intent.setClass(this, cls);
		if (bundle != null) {
			intent.putExtras(bundle);
		}
		startActivity(intent);
	}

	/** ͨ��Action��ת���� **/
	protected void startActivity(String action) {
		startActivity(action, null);
	}

	/** ����Bundleͨ��Action��ת���� **/
	protected void startActivity(String action, Bundle bundle) {
		Intent intent = new Intent();
		intent.setAction(action);
		if (bundle != null) {
			intent.putExtras(bundle);
		}
		startActivity(intent);
	}
}
