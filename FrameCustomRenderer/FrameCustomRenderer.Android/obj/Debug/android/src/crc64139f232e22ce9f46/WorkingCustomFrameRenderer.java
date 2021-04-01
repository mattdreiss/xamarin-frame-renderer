package crc64139f232e22ce9f46;


public class WorkingCustomFrameRenderer
	extends crc64ee486da937c010f4.FrameRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("FrameCustomRenderer.Android.WorkingCustomFrameRenderer, FrameCustomRenderer.Android", WorkingCustomFrameRenderer.class, __md_methods);
	}


	public WorkingCustomFrameRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == WorkingCustomFrameRenderer.class)
			mono.android.TypeManager.Activate ("FrameCustomRenderer.Android.WorkingCustomFrameRenderer, FrameCustomRenderer.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public WorkingCustomFrameRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == WorkingCustomFrameRenderer.class)
			mono.android.TypeManager.Activate ("FrameCustomRenderer.Android.WorkingCustomFrameRenderer, FrameCustomRenderer.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public WorkingCustomFrameRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == WorkingCustomFrameRenderer.class)
			mono.android.TypeManager.Activate ("FrameCustomRenderer.Android.WorkingCustomFrameRenderer, FrameCustomRenderer.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
