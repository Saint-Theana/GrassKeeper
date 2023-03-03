package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CompoundQueueData {
    @Tag(tag=1) public Integer outputCount = null;
    @Tag(tag=4) public Integer compoundId = null;
    @Tag(tag=14) public Integer outputTime = null;
    @Tag(tag=8) public Integer waitCount = null;
}
