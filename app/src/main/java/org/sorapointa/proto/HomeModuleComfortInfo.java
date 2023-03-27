package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeModuleComfortInfo {
    @Tag(tag=3) public List<Integer> worldSceneBlockComfortValueList = new ArrayList<>();
    @Tag(tag=13) public Integer moduleId = null;
    @Tag(tag=2) public Integer roomSceneComfortValue = null;
}
