package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryDecomposeReq {
    @Tag(tag=13) public Integer configId = null;
    @Tag(tag=9) public Integer targetCount = null;
    @Tag(tag=8) public List<Long> guidList = new ArrayList<>();
}
