package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetStateNotify {
    @Tag(tag=5) public Integer gadgetEntityId = null;
    @Tag(tag=3) public Integer gadgetState = null;
    @Tag(tag=11) public Boolean isEnableInteract = null;
}
