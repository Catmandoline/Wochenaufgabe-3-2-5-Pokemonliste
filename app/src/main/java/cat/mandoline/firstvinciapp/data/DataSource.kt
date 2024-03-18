package cat.mandoline.firstvinciapp.data

import cat.mandoline.firstvinciapp.data.model.Pokemon
import cat.mandoline.firstvinciapp.R

class DataSource {
    fun loadPokemon(): List<Pokemon> {
        return listOf(
            Pokemon(R.drawable.bisasam, "Bisasam", "#001", "Pflanze/Gift"),
            Pokemon(R.drawable.bisaknosp, "Bisaknosp", "#002", "Pflanze/Gift"),
            Pokemon(R.drawable.bisaflor, "Bisaflor", "#003", "Pflanze/Gift"),
            Pokemon(R.drawable.glumanda, "Glumanda", "#004", "Feuer"),
            Pokemon(R.drawable.glutexo, "Glutexo", "#005", "Feuer"),
            Pokemon(R.drawable.glurak, "Glurak", "#006", "Feuer/Flug"),
            Pokemon(R.drawable.schiggy, "Schiggy", "#007", "Wasser"),
            Pokemon(R.drawable.schillok, "Schillok", "#008", "Wasser"),
            Pokemon(R.drawable.turtok, "Turtok", "#009", "Wasser"),
            Pokemon(R.drawable.raupy, "Raupy", "#010", "Käfer"),
            Pokemon(R.drawable.safcon, "Safcon", "#011", "Käfer"),
            Pokemon(R.drawable.smettbo, "Smettbo", "#012", "Käfer/Flug"),
            Pokemon(R.drawable.hornliu, "Hornliu", "#013", "Käfer/Gift"),
            Pokemon(R.drawable.kokuna, "Kokuna", "#014", "Käfer/Gift"),
            Pokemon(R.drawable.bibor, "Bibor", "#015", "Käfer/Gift"),
            Pokemon(R.drawable.taubsi, "Taubsi", "#016", "Normal/Flug"),
            Pokemon(R.drawable.tauboga, "Tauboga", "#017", "Normal/Flug"),
            Pokemon(R.drawable.tauboss, "Tauboss", "#018", "Normal/Flug"),
            Pokemon(R.drawable.rattfratz, "Rattfratz", "#019", "Normal"),
            Pokemon(R.drawable.rattikarl, "Rattikarl", "#020", "Normal"),
            Pokemon(R.drawable.habitak, "Habitak", "#021", "Normal/Flug"),
            Pokemon(R.drawable.ibitak, "Ibitak", "#022", "Normal/Flug"),
            Pokemon(R.drawable.rettan, "Rettan", "#023", "Gift"),
            Pokemon(R.drawable.arbok, "Arbok", "#024", "Gift"),
            Pokemon(R.drawable.pikachu, "Pikachu", "#025", "Elektro"),
            Pokemon(R.drawable.raichu, "Raichu", "#026", "Elektro"),
            Pokemon(R.drawable.sandan, "Sandan", "#027", "Boden"),
            Pokemon(R.drawable.sandamer, "Sandamer", "#028", "Boden"),
            Pokemon(R.drawable.nidoran_weiblich, "Nidoran ♀", "#029", "Gift"),
            Pokemon(R.drawable.nidorina, "Nidorina", "#030", "Gift"),
            Pokemon(R.drawable.nidoqueen, "Nidoqueen", "#031", "Gift/Boden"),
            Pokemon(R.drawable.nidoran_maennlich, "Nidoran ♂", "#032", "Gift"),
            Pokemon(R.drawable.nidorino, "Nidorino", "#033", "Gift"),
            Pokemon(R.drawable.nidoking, "Nidoking", "#034", "Gift/Boden"),
            Pokemon(R.drawable.piepi, "Piepi", "#035", "Fee"),
            Pokemon(R.drawable.pixi, "Pixi", "#036", "Fee"),
            Pokemon(R.drawable.vulpix, "Vulpix", "#037", "Feuer"),
            Pokemon(R.drawable.vulnona, "Vulnona", "#038", "Feuer"),
            Pokemon(R.drawable.pummeluff, "Pummeluff", "#039", "Normal/Fee"),
            Pokemon(R.drawable.knuddeluff, "Knuddeluff", "#040", "Normal/Fee"),
            Pokemon(R.drawable.zubat, "Zubat", "#041", "Gift/Flug"),
            Pokemon(R.drawable.golbat, "Golbat", "#042", "Gift/Flug"),
            Pokemon(R.drawable.myrapla, "Myrapla", "#043", "Pflanze/Gift"),
            Pokemon(R.drawable.duflor, "Duflor", "#044", "Pflanze/Gift"),
            Pokemon(R.drawable.giflor, "Giflor", "#045", "Pflanze/Gift"),
            Pokemon(R.drawable.paras, "Paras", "#046", "Käfer/Pflanze"),
            Pokemon(R.drawable.parasek, "Parasek", "#047", "Käfer/Pflanze"),
            Pokemon(R.drawable.bluzuk, "Bluzuk", "#048", "Käfer/Gift"),
            Pokemon(R.drawable.omot, "Omot", "#049", "Käfer/Gift"),
            Pokemon(R.drawable.digda, "Digda", "#050", "Boden"),
            Pokemon(R.drawable.digdri, "Digdri", "#051", "Boden"),
            Pokemon(R.drawable.mauzi, "Mauzi", "#052", "Normal"),
            Pokemon(R.drawable.snobilikat, "Snobilikat", "#053", "Normal"),
            Pokemon(R.drawable.mewtu, "Mewtu", "#150", "Boden"),
            Pokemon(R.drawable.mew, "Mew", "#151", "Boden"),
        )
    }
}