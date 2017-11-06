
SUMMARY = "This package intended for exploring yocto recipes creation process"
DESCRIPTION = "Console game, based on ncurses librirary"
HOMEPAGE = "http://ninvaders.sourceforge.net"
SECTION = "console/tools"

DEPENDS = "ncurses"

EXTRA_OEMAKE = "'CC=${CC}'"

do_install () {
    oe_runmake install "DESTDIR=${D}${bindir}"
}


