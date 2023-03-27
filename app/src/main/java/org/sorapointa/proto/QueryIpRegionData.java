package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QueryIpRegionData {
    @Tag(tag=1) public String ip = null;
    @Tag(tag=2) public String gameBiz = null;
    @Tag(tag=3) public String source = null;
}
