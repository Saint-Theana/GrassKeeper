package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TriggerCreateGadgetToEquipPartNotify {
    @Tag(tag=1) public Integer gadgetId = null;
    @Tag(tag=13) public Integer entityId = null;
    @Tag(tag=14) public String equipPart = null;
    @Tag(tag=10) public Integer gadgetEntityId = null;
}
