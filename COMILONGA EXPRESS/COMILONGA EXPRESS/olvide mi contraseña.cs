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
    public partial class olvide_mi_contraseña : Form
    {
        public olvide_mi_contraseña()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form menu = new Menú();
            menu.Show();
            menu.Visible = true;
            Visible = false;
        }
    }
}
