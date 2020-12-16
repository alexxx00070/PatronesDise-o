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
    public partial class Agregar_Tarjeta : Form
    {
        public Agregar_Tarjeta()
        {
            InitializeComponent();
        }


        private void textBox1_Enter(object sender, EventArgs e)
        {
            if (textBox1.Text == "XXXX XXXX XXXX XXXX")
            {
                textBox1.Text = "";
                textBox1.ForeColor = Color.Black;
            }
        }

        private void textBox1_Leave(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                textBox1.Text = "XXXX XXXX XXXX XXXX";
                textBox1.ForeColor = Color.Silver;
            }
        }

        private void textBox3_Enter(object sender, EventArgs e)
        {
            if (textBox3.Text == "(MM/AA)")
            {
                textBox3.Text = "";
                textBox3.ForeColor = Color.Black;
            }
        }

        private void textBox3_Leave(object sender, EventArgs e)
        {
            if (textBox3.Text == "")
            {
                textBox3.Text = "(MM/AA)";
                textBox3.ForeColor = Color.Silver;
            }
        }

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            Validaciones.SoloNumeros(e);
        }

        private void textBox2_KeyPress(object sender, KeyPressEventArgs e)
        {
            Validaciones.SoloLetras(e);
        }

        private void textBox3_KeyPress(object sender, KeyPressEventArgs e)
        {
            Validaciones.SoloNumeros(e);
        }

        private void textBox4_KeyPress(object sender, KeyPressEventArgs e)
        {
            Validaciones.SoloNumeros(e);
        }

        private void textBox4_Enter(object sender, EventArgs e)
        {
            if (textBox4.Text == "(CVV)")
            {
                textBox4.Text = "";
                textBox4.ForeColor = Color.Black;
            }
        }

        private void textBox4_Leave(object sender, EventArgs e)
        {
            if (textBox4.Text == "")
            {
                textBox4.Text = "(CVV)";
                textBox4.ForeColor = Color.Silver;
            }
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
