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
    public partial class Inicio_de_sesion : Form
    {
        public Inicio_de_sesion()
        {
            InitializeComponent();
        }

        private void Inicio_de_sesion_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form1 home = new Form1();
            home.Visible = true;
            Visible = false;
        }

       
        private void label3_Click(object sender, EventArgs e)
        {

            Form formulario1 = new olvide_mi_contraseña();
            formulario1.Show();
            formulario1.Visible = true;
            Visible = false;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form formulario2 = new Menú();
            formulario2.Show();
            formulario2.Visible = true;
            Visible = false;
        }
    }
}
