package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SegmentInfo {
    @Tag(tag=3) public Integer offset = null;
    @Tag(tag=7) public Integer module = null;
    @Tag(tag=8) public Integer size = null;
}
