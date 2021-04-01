using System.Collections.ObjectModel;
using Xamarin.Forms;

namespace FrameCustomRenderer
{
    public partial class MainPage : ContentPage
    {
        public ObservableCollection<Color> Colors { get; } = new ObservableCollection<Color>
        {
            Color.Red, Color.Orange, Color.Yellow, Color.Green, Color.Blue, Color.Indigo, Color.Violet
        };

        public MainPage()
        {
            InitializeComponent();
            BindingContext = this;
        }
    }
}
