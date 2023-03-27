package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityGadget {
    @Tag(tag=1) public Integer campId = null;
    @Tag(tag=2) public Integer campTargetType = null;
    @Tag(tag=3) public Integer targetEntityId = null;
}
