package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShowEquip {
    @Tag(tag=1) public Integer itemId = null;
    @Tag(tag=2) public Reliquary reliquary = null;
    @Tag(tag=3) public Weapon weapon = null;
}
