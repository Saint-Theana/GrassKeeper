package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Reliquary.*;
import org.sorapointa.proto.Reliquary;
import org.sorapointa.proto.Weapon.*;
import org.sorapointa.proto.Weapon;

public class ShowEquip {
    @Tag(tag=1) public Integer itemId = null;
    @Tag(tag=2) public Reliquary reliquary = null;
    @Tag(tag=3) public Weapon weapon = null;
}
