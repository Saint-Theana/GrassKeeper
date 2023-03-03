package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityEmbryo.*;
import org.sorapointa.proto.AbilityEmbryo;

public class AbilityControlBlock {
    @Tag(tag=1) public List<AbilityEmbryo> abilityEmbryoList = new ArrayList<>();
}
