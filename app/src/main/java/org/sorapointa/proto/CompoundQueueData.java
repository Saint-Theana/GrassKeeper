package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CompoundQueueData {
    @Tag(tag=12) public Integer outputCount = null;
    @Tag(tag=9) public Integer compoundId = null;
    @Tag(tag=8) public Integer waitCount = null;
    @Tag(tag=11) public Integer outputTime = null;
}
