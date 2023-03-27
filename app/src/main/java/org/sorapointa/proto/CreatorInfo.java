package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CreatorInfo {
    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=12) public LocationInfo locationInfo = null;
    @Tag(tag=5) public Integer opType = null;
}
