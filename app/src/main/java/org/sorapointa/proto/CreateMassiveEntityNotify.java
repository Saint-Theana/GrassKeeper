package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ServerMassiveEntity.*;
import org.sorapointa.proto.ServerMassiveEntity;

public class CreateMassiveEntityNotify {
    @Tag(tag=15) public List<ServerMassiveEntity> massiveEntityList = new ArrayList<>();
}
