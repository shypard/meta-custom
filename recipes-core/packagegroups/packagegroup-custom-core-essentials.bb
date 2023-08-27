DESCRIPTION = "My custom core package group"
LICENSE     = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "  \
    useradd         \
    ntpd            \
"

