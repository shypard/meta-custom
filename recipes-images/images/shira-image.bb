SUMMARY = "A minimal custom image for the STM32 Bootstrapping Tutorials."
LICENSE = "MIT"

# Build our image based on the core-image
inherit core-image

# Include Distro configuration
require conf/distro/shira.conf

# Set image name, the default target machine and the language
IMAGE_NAME      = "shira-image"
IMAGE_LINGUAS   = "en-us"
MACHINE_NAME    = "stm32mp1"

# Add custom packages
IMAGE_INSTALL   = "                         \
    packagegroup-core-boot                  \
    packagegroup-core-ssh-openssh           \
    packagegroup-custom-core-essentials     \
    packagegroup-custom-extended-essentials \
"