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
    public partial class Menú : Form
    {
        public Menú()
        {
            InitializeComponent();
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            Form restaurante = new Restaurante();
            restaurante.Show();
            restaurante.Visible = true;
            Visible = false;
        }

        private void pictureBox9_Click(object sender, EventArgs e)
        {
            Form perfil = new Perfil();
            perfil.Show();
            perfil.Visible = true;
            Visible = false;

        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {
            Form cafeteria = new Cafeteria();
            cafeteria.Show();
            cafeteria.Visible = true;
            Visible = false;
        }

        private void pictureBox5_Click(object sender, EventArgs e)
        {
            Form comida = new Comida_Rapida();
            comida.Show();
            comida.Visible = true;
            Visible = false;
        }

        private void pictureBox10_Click(object sender, EventArgs e)
        {
            Form pago = new Metodo_de_pago();
            pago.Show();
            pago.Visible = true;
            Visible = false;
        }
    }
}
