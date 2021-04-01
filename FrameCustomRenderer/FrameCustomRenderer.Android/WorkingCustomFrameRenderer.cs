using Android.Content;
using FrameCustomRenderer;
using FrameCustomRenderer.Android;
using Xamarin.Forms;

[assembly: ExportRenderer(typeof(WorkingCustomFrame), typeof(WorkingCustomFrameRenderer))]
namespace FrameCustomRenderer.Android
{
    public class WorkingCustomFrameRenderer : Xamarin.Forms.Platform.Android.FastRenderers.FrameRenderer
    {
        public WorkingCustomFrameRenderer(Context context) : base(context) { }
    }
}
