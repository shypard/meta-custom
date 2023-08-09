SUMMARY = "A minimal custom image for the STM32 Bootstrapping Tutorials."

LICENSE = "MIT"

inherit core-image

export IMAGE_BASENAME = "custom-image"
MACHINE_NAME ?= "stm32mp1"
IMAGE_NAME = "${MACHINE_NAME}_${IMAGE_BASENAME}"

IMAGE_LINGUAS = "en-us"

IMAGE_INSTALL = "packagegroup-core-boot \
                 packagegroup-core-ssh-openssh \
                 packagegroup-custom-core-essentials \
                 packagegroup-custom-extended-essentials"