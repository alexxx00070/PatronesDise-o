using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace COMILONGA_EXPRESS
{
    public partial class Comida_Rapida : Form
    {
        public Comida_Rapida()
        {
            InitializeComponent();
        }

        private void pictureBox8_Click(object sender, EventArgs e)
        {
            Form home = new Menú();
            home.Show();
            home.Visible = true;
            Visible = false;
        }
    }
}
