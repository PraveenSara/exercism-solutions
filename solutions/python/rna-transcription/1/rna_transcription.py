def to_rna(dna_strand):
    trans = str.maketrans("CGTA", "GCAU")
    return dna_strand.translate(trans)
