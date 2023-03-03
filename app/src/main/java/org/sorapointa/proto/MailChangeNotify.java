package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MailData.*;
import org.sorapointa.proto.MailData;

public class MailChangeNotify {
    @Tag(tag=14) public List<MailData> mailList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> delMailIdList = new ArrayList<>();
}
