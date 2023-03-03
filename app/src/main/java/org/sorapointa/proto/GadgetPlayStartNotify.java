package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetPlayStartNotify {
    @Tag(tag=14) public Integer startTime = null;
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=8) public Integer playType = null;
}
