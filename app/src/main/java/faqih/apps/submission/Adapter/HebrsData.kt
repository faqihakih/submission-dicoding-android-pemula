package faqih.apps.submission.Adapter

import faqih.apps.submission.Data.Hebrs
import faqih.apps.submission.R

object HebrsData {
    private val hebrsName = arrayOf("Asam Jawa",
        "Cengkeh",
        "Daun Salam",
        "Jahe Merah",
        "Kapulaga",
        "Kemiri",
        "Kencur",
        "Ketumbar",
        "Kunyit",
        "Lengkuas",
        "Pala",
        "Serai")

    private val hebrsDescription = arrayOf("Asam jawa biasa disebutnya sebagai asam kawak karena warnanya yang hitam. Bagian yang bisa digunakan dari buah yang termasuk keluarga Caesalpinaceae (Leguminosae). daging buah, daun muda (sinom), dan kulit kayunya.",
        "Cengkeh adalah rempah serbaguna dengan rasa manis dan aroma harum yang khas. Cengkeh biasanya digunakan sebagai bumbu rendaman untuk panggangan, menambah rasa pada minuman hangat, hingga untuk memperkuat aroma kue.",
        "Daun salam di Indonesia bisa ditemui daun salam dalam bentuk segar dan kering, baik segar maupun kering tetap bisa menghasilkan aroma yang wangi pada masakan.",
        "Jahe di Indonesia ada jahe merah dan jahe biasa yang dipakai pada masakan. Jahe merah dipakai untuk pengobatan penyakit secara tradisional.",
        "Kapulaga bentuknya seperti kuntum bunga, warnanya putih, dan ringan. Biasa dijual dalam kemasan kantong ataupun dalam bentuk bubuk.",
        "Kemiri adalah tumbuhan yang bijinya dapat dimanfaatkan sebagai sumber minyak maupun rempah untuk masakan. Kemiri juga dikenal dengan nama candle berry, indian walnut, atau candle nut.",
        "Kencur adalah salah satu jenis bumbu dapur yang memiliki aroma khas yang segar dan menyeruak.",
        "Ketumbar adalah salah satu jenis rempah yang banyak digunakan sebagai penyedap masakan.",
        "Kunyit termasuk dalam jenis temu-temuan dan tergolong dalam famili Zingiberaceae. Bagian utama dari tanaman kunyit adalah rimpangnya atau tempat tumbuhnya tunas.",
        "Lengkuas adalah salah satu bumbu yang selalu ada di dapur, selain bawang putih, bawang merah, kunyit, cabai, dan lain sebagainya.",
        "Pala adalah rempah yang berasal dari biji pohon pala. Selain menghasilkan biji pala, pohon tersebut juga menghasilkan bunga pala",
        "Serai atau sebagian orang menyebutnya dengan nama sereh merupakan salah satu bumbu masakan andalan, karena menambah wangi dan cita rasa suatu masakan.")

    private val hebrsEfficacy = arrayOf("Membantu menjaga kesehatan sistem pencernaan, Menjaga kesehatan jantung, Membantu mengontrol gula darah.",
        "Menurunkan Kadar Gula Darah, Sebagai Obat Nyamuk Alami, Memperlancar Pencernaan.",
        "Menyehatkan Pencernaan, Menjaga Kesehatan Jantung, Menangkal Penyakit Kanker.",
        "Mengatasi Rematik, Mengobati Berbagai Bentuk Mual, Sebagai Antioksidan.",
        "Menurunkan tekanan darah, Mencegah penyakit kronis, Mengatasi masalah pencernaan.",
        "Meningkatkan sistem pencernaan, Meringankan Infeksi Jamur, Mengurangi Risiko Penyakit Jantung.",
        "Mencegah kanker, Menurunkan tekanan darah, Membasmi bakteri penyebab penyakit.",
        "Melancarkan Sistem Pencernaan, Menurunkan Kadar Gula Darah, Mengatasi Infeksi Bakteri.",
        "Meningkatkan Daya Tahan Tubuh, Mengobati Radang, Mengurangi Rasa Mual.",
        "Meredakan nyeri sendi, Meningkatkan kesuburan pria, Menurunkan kadar gula darah dan kolesterol.",
        "Menghilangkan Masuk Angin, Menghilangkan Insomnia, Menambah Nafsu Makan.",
        "Baik untuk Saluran Pencernaan, Antioksidan, Mengontrol Tekanan Darah.")

    private val hebrsImages = intArrayOf(R.drawable.asamjawa,
        R.drawable.cengkeh,
        R.drawable.daunsalam,
        R.drawable.jahemerah,
        R.drawable.kapulaga,
        R.drawable.kemiri,
        R.drawable.kencur,
        R.drawable.ketumbar,
        R.drawable.kunyit,
        R.drawable.lengkuas,
        R.drawable.pala,
        R.drawable.serai)

    val listData : ArrayList<Hebrs>
        get() {
            val list = arrayListOf<Hebrs>()
            for (positions in hebrsName.indices){
                val hebrs = Hebrs()
                hebrs.name = hebrsName[positions]
                hebrs.description = hebrsDescription[positions]
                hebrs.efficacy = hebrsEfficacy[positions]
                hebrs.image = hebrsImages[positions]
                list.add(hebrs)
            }
            return list
        }
}