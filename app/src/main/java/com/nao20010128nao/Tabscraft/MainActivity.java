package com.nao20010128nao.Tabscraft;

import android.app.*;
import android.os.*;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.widget.TabHost;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends FragmentActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		//Thanked by : http://rakuishi.com/archives/6609/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		FragmentTabHost fth=(FragmentTabHost)findViewById(android.R.id.tabhost);
		TabHost.TabSpec spec=fth.newTabSpec("players");
		spec.setIndicator("Players");
		fth.addTab(spec,BlankFragment.class,null);
		
		spec=fth.newTabSpec("details");
		spec.setIndicator("Details");
		fth.addTab(spec,BlankFragment.class,null);
		
		spec=fth.newTabSpec("plugins");
		spec.setIndicator("Plugins");
		fth.addTab(spec,BlankFragment.class,null);
    }
	public static class BlankFragment extends android.support.v4.app.Fragment {

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			// TODO: Implement this method
			return new LinearLayout(getActivity());
		}
	}
}
