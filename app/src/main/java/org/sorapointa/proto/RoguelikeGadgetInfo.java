package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeGadgetInfo {
    @Tag(tag=1) public Integer cellConfigId = null;
    @Tag(tag=2) public Integer cellType = null;
    @Tag(tag=3) public Integer cellState = null;
    @Tag(tag=4) public Integer cellId = null;
}
