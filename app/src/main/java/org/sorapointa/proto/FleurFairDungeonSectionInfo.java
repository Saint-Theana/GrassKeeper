package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairDungeonSectionInfo {
    @Tag(tag=10) public Integer sectionId = null;
    @Tag(tag=13) public Integer openTime = null;
    @Tag(tag=1) public Boolean isOpen = null;
}
