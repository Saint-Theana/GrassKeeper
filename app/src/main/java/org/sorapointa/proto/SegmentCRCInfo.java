package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SegmentCRCInfo {
    @Tag(tag=13) public Integer module = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer size = null;
    @Tag(tag=3) public String crc = null;
    @Tag(tag=11) public Integer offset = null;
}
