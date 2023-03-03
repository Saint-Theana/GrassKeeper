package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlockInfo {
    @Tag(tag=1) public Integer blockId = null;
    @Tag(tag=2) public Integer dataVersion = null;
    @Tag(tag=3) public byte[] binData = null;
    @Tag(tag=4) public Boolean isDirty = null;
}
