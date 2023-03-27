package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SegmentInfo {
    @Tag(tag=6) public Integer size = null;
    @Tag(tag=9) public Integer offset = null;
    @Tag(tag=12) public Integer module = null;
}
