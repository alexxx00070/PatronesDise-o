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
    public partial class Metodo_de_pago : Form
    {
        public Metodo_de_pago()
        {
            InitializeComponent();
        }

        private void pictureBox5_Click(object sender, EventArgs e)
        {
            Form pago = new Agregar_Tarjeta();
            pago.Show();
            pago.Visible = true;
            Visible = false;
        }
    }
}
