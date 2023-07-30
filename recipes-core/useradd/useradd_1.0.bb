SUMMARY = "Recipe for adding a new user"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit useradd

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "--create-home \
                       --password '$5$sOwr4Sflx10UabPD$IcN68zAXKPMuLivo2gYIRGk9I9fr2wbgjwtuPd8USj4' \
                       shypard"

do_install () {
    echo "----------------------------------------"
    echo "| do_install for ${PN}                 |"
    echo "| running useradd_1.0.bb do_install    |"
    echo "----------------------------------------"
}


# --groups tty,sudo \
# openssl passwd -5 enterprise
# -5 for sha256, -6 for sha512