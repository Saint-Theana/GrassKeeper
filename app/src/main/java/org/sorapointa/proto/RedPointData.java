package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RedPointData {
    @Tag(tag=1) public Integer redPointType = null;
    @Tag(tag=2) public Boolean isShow = null;
    @Tag(tag=3) public Integer contentId = null;
}
