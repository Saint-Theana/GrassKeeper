package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MapAreaInfo {
    @Tag(tag=1) public Integer mapAreaId = null;
    @Tag(tag=2) public Boolean isOpen = null;
}
