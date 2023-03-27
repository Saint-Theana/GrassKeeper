package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonBlock {
    @Tag(tag=15) public Integer blockId = null;
    @Tag(tag=2) public Vector rot = null;
    @Tag(tag=11) public Vector pos = null;
    @Tag(tag=1) public Integer guid = null;
}
