package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Equip {
    @Tag(tag=1) public Reliquary reliquary = null;
    @Tag(tag=2) public Weapon weapon = null;
    @Tag(tag=3) public Boolean isLocked = null;
}
