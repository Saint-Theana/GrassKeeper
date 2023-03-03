package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneReliquaryInfo {
    @Tag(tag=1) public Integer itemId = null;
    @Tag(tag=2) public Long guid = null;
    @Tag(tag=3) public Integer level = null;
    @Tag(tag=4) public Integer promoteLevel = null;
}
