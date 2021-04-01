using Android.Content;
using FrameCustomRenderer;
using FrameCustomRenderer.Android;
using Xamarin.Forms;

[assembly: ExportRenderer(typeof(BrokenCustomFrame), typeof(BrokenCustomFrameRenderer))]
namespace FrameCustomRenderer.Android
{
    public class BrokenCustomFrameRenderer : Xamarin.Forms.Platform.Android.FrameRenderer
    {
        public BrokenCustomFrameRenderer(Context context) : base(context) { }
    }
}
