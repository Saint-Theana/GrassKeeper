package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtBeingHealedNotify {
    @Tag(tag=1) public Integer targetId = null;
    @Tag(tag=5,isFloat=true) public Float realHealAmount = null;
    @Tag(tag=13) public Integer sourceId = null;
    @Tag(tag=4,isFloat=true) public Float healAmount = null;
}
