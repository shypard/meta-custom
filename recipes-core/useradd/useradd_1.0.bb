SUMMARY = "Recipe for adding a new user"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

# Use the useradd class to create a new user. This avoids
# having to write the code to create the user and group
# yourself.
inherit useradd

# Set the user name and home directory. 
USER_NAME ?= "shypard"
USER_HOME ?= "/home/${USER_NAME}"

# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "${PN}"

# USERADD_PARAM specifies command line options to pass to the
# useradd command. Multiple users can be created by separating
# the commands with a semicolon.
USERADD_PARAM:${PN} = "--groups sudo \
                       --password '\$5\$gfvA67cNvhfVDA6p\$vgIOOP6KQjyNpUAJnbkSxeTXOwdA2Bxh.4xMHsdZaJ/' \
                       ${USER_NAME}"

ALLOW_EMPTY:${PN} = "1"