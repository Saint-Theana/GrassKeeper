package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SegmentCRCInfo {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public String crc = null;
    @Tag(tag=5) public Integer offset = null;
    @Tag(tag=14) public Integer module = null;
    @Tag(tag=8) public Integer size = null;
}
