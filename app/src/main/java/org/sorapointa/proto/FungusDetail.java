package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusDetail {
    @Tag(tag=12) public Boolean isCultivate = null;
    @Tag(tag=14) public Integer captureOrder = null;
    @Tag(tag=3) public Integer minCultivateStep = null;
    @Tag(tag=6) public Integer fungusId = null;
    @Tag(tag=4) public Integer nameId = null;
}
