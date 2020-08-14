package com.nicktra.kpoppedia

object KpopData {
    private val kpopNames = arrayOf("Red Velvet",
        "IZ*ONE",
        "Big Bang",
        "TWICE",
        "BLACKPINK",
        "BTS",
        "CNBLUE",
        "Girls' Generation",
        "Itzy",
        "Super Junior")

    private val kpopDetails = arrayOf("Red Velvet (Hangul: 레드벨벳) is a South Korean girl group formed and managed by SM Entertainment. They debuted on August 1, 2014 with the digital single \"Happiness\" with the four-member line-up of Irene, Seulgi, Wendy and Joy. Yeri joined the group in March 2015, following their first major release, Ice Cream Cake. Musically, Red Velvet employs a unique dual sonic concept that reflects their own group name: their predominantly-pop \"red\" side experiments occasionally with electronic, while their \"velvet\" side focuses on '90s-influenced R&B with elements of funk, hip hop and jazz.\n\nThe group's Korean-language discography includes two studio albums, one reissue album, one compilation and nine extended plays—eleven of which topped South Korea's Gaon Album Chart. Hit singles \"Red Flavor\" and \"Power Up\" charted at number one on the Gaon Digital Chart; other singles \"Happiness\", \"Ice Cream Cake\", \"Dumb Dumb\", \"Russian Roulette\", \"Rookie\", \"Peek-a-Boo\", \"Bad Boy\" and \"Psycho\" have all charted in the top five domestically. The group ventured into the Japanese music scene with the extended plays #Cookie Jar (2018) and Sappy (2019).",
        "Iz*One (/ˈaɪz wʌn/ EYEZ-wun; Korean: 아이즈원, romanized: Aijeuwon; Japanese: アイズワン, romanized: Aizuwan; stylized as IZ*ONE) is a South Korean–Japanese girl group formed through the Mnet reality competition show Produce 48. The group, managed by Off the Record and Swing Entertainment, is composed of twelve members: Jang Won-young, Sakura Miyawaki, Jo Yu-ri, Choi Ye-na, An Yu-jin, Nako Yabuki, Kwon Eun-bi, Kang Hye-won, Hitomi Honda, Kim Chae-won, Kim Min-ju, and Lee Chae-yeon. Since their debut as Iz*One they released one studio album, six extended plays (three in Korean and three in Japanese).\n\nIz*One debuted on October 29, 2018 with their first extended play (EP) Color*Iz. Upon its release, the group received immediate commercial success, selling over 225,000 units and peaking at number 2 on South Korea's Gaon Album Chart. In addition, both the EP and its lead single \"La Vie en Rose\" charted on Billboard World Albums and World Digital Songs respectively. The early success subsequently hailed them as the New Artist of the Year at several awards ceremonies, including Golden Disc Awards and Seoul Music Awards.",
        "Big Bang (Korean: 빅뱅; stylized as BIGBANG) is a South Korean boy band formed by YG Entertainment. The group consists of four members: G-Dragon, T.O.P, Taeyang, and Daesung; member Seungri retired from the entertainment industry on March 11, 2019. Dubbed the \"Kings of K-pop\", they helped spread the Korean Wave internationally and are one of the most influential acts in K-pop history. They are best known for their musical experimentation and versatility, self-production, and stage presence.\n\nAlthough their debut album, Bigbang Vol.1 (2006), was released to lukewarm reception, greater success followed with a string of hit singles: \"Lies\" (Korean: 거짓말), which topped Korean music charts for a record-breaking six consecutive weeks and won Song of the Year at the 2007 Mnet Km Music Festival and the 2008 Seoul Music Awards; \"Last Farewell\" (Korean: 마지막 인사); \"Day by Day\" (Korean: 하루하루); and \"Sunset Glow\" (Korean: 붉은노을). After winning Artist of the Year at the 2008 Mnet Korean Music Festival and the 2008 Seoul Music Awards, the group released four Japanese studio albums—Big Bang (2009), Big Bang 2 (2011), Alive (2012), and Made Series (2016)—all of which were certified gold by the Recording Industry Association of Japan. After a two-year hiatus in South Korea, the quintet returned with increasingly innovative and critically-acclaimed records. Their fourth EP, Tonight (2011), won them the inaugural Best Worldwide Act Award at the 2011 MTV Europe Music Awards. Their fifth EP, Alive (2012), became the first Korean album to chart on the US Billboard 200. Their third album, Made (2016), was preceded by several chart-topping singles and won the group the Artist of the Year awards at the 2015 Mnet Asian Music Awards for the third time and at the 2015 Melon Music Awards. The Made World Tour attracted 1.5 million people, making it the most-attended concert tour headlined by a Korean act in history at the time.",
        "Twice (Korean: 트와이스; Japanese: トゥワイス), is a South Korean girl group formed by JYP Entertainment. The group is composed of nine members: Nayeon, Jeongyeon, Momo, Sana, Jihyo, Mina, Dahyun, Chaeyoung, and Tzuyu. Twice was formed under the television program Sixteen (2015) and debuted on October 20, 2015, with the extended play (EP) The Story Begins.\n\nTwice rose to domestic fame in 2016 with their single \"Cheer Up\", which charted at number one on the Gaon Digital Chart, became the best-performing single of the year, and won \"Song of the Year\" at the Melon Music Awards and Mnet Asian Music Awards. Their next single, \"TT\", from their third EP Twicecoaster: Lane 1, topped the Gaon charts for four consecutive weeks. The EP was the highest selling K-pop girl group album of 2016. Within 19 months after debut, Twice had already sold over 1.2 million units of their four EPs and special album; in 2019, they became the best-selling Korean girl group of all-time. The group has sold over 9 million albums in South Korea and Japan as of July 2020. In 2020, Twice signed with Republic Records for American promotions as part of a partnership with JYP Entertainment.",
        "Blackpink (Hangul: 블랙핑크; commonly stylized as BLACKPINK or BLΛƆKPIИK) are a South Korean girl group formed by YG Entertainment, consisting of members Jisoo, Jennie, Rosé, and Lisa. They debuted in August 2016 with their single album Square One, which spawned \"Whistle\" and \"Boombayah\", their first number-one hits in South Korea and on the Billboard World Digital Song Sales chart, respectively.\n\nBlackpink are the highest-charting female Korean act on the Billboard Hot 100 (peaking at number 33 with their 2020 singles \"How You Like That\" and \"Sour Candy\") and the Billboard 200 (peaking at number 24 with their 2019 extended play Kill This Love). They were the first Korean girl group to enter and top Billboard's Emerging Artists chart and to have three number-one singles on Billboard's World Digital Song Sales chart.",
        "BTS (Korean: 방탄소년단; RR: Bangtan Sonyeondan), also known as the Bangtan Boys, is a seven-member South Korean boy band who began formation in 2010 and debuted in 2013.[3] The septet co-writes and produces much of their output. Originally a hip hop group, their musical style has evolved to include a wide range of genres. Their lyrics, often focused on personal and social commentary, touch on the themes of mental health, troubles of school-age youth, loss, the journey towards loving oneself, and individualism. Their work features references to literature and psychological concepts and includes an alternative universe storyline. The group has staged several world tours.\n\nThe group initially formed as teenagers under Big Hit Entertainment and released their debut single album, 2 Cool 4 Skool (2013). Subsequent work such as their first U.S. Billboard 200 entries The Most Beautiful Moment in Life, Part 2 (2015), The Most Beautiful Moment in Life: Young Forever (2016), and Wings (2016) helped establish BTS' reputation as a socially conscious group. Wings became BTS' first album to sell one million copies in South Korea. By 2017, BTS crossed into the international music market, leading the Korean Wave into the United States and breaking numerous sales records, becoming the first Korean group to receive a certification from the Recording Industry Association of America (RIAA) for their single \"Mic Drop\". The band is the first Korean act to top the Billboard 200 with their studio album Love Yourself: Tear (2018) and have since hit the top of the U.S. charts with their albums Love Yourself: Answer (2018), Map of the Soul: Persona (2019) and Map of the Soul: 7 (2020), making BTS the fastest group since the Beatles to earn four number one albums in less than two years. Love Yourself: Answer also broke South Korea's Gaon Album Chart's all-time monthly record previously set by Love Yourself: Tear and became the first Korean album certified Platinum in the United States.",
        "CNBLUE (Korean: 씨엔블루) is a South Korean pop rock band formed in 2009. The band consists of Jung Yong-hwa (leader, main vocals, guitar, keyboard, rap), Kang Min-hyuk (drums), and Lee Jung-shin (bass). First bassist Kwon Kwang-jin left the band after they released their debut Japanese extended play Now or Never in 2009, and was replaced by Lee Jung-shin. Lee Jong-hyun (guitar and vocals) left the band on August 28, 2019.\n\nCN is an initialism for Code Name, while BLUE is a backronym for burning, lovely, untouchable, and emotional; it is meant to portray the images of Jong-hyun, Min-hyuk, Jung-shin, and Yong-hwa, respectively. On January 14, 2010, CNBLUE debuted in Korea with the lead single \"I'm a Loner\" from their first Korean EP Bluetory.",
        "Girls' Generation (Korean: 소녀시대; RR: Sonyeo Sidae), also known as SNSD, is a South Korean girl group formed by SM Entertainment. The group is composed of eight members: Taeyeon, Sunny, Tiffany, Hyoyeon, Yuri, Sooyoung, Yoona, and Seohyun. Originally a nine-piece group, Jessica departed from the group in September 2014. One of the prominent figures of the Korean Wave, the group has earned numerous accolades and the honorific nickname \"The Nation's Girl Group\" in their home country.\n\nGirls' Generation debuted in August 2007 with their eponymous Korean album and the single \"Into the New World\". The group rose to fame in 2009 with the single \"Gee\", which claimed the top spot on KBS's Music Bank for a record-breaking nine consecutive weeks and was Melon's most popular song of the 2000s decade. Girls' Generation consolidated their popularity in South Korea with follow-up singles \"Genie\", \"Oh!\", and \"Run Devil Run\", which were released between mid-2009 and early 2010. Their second Korean studio album, Oh! (2010), won the Golden Disc award for Album of the Year, making the group the only female act to win the grand prize so far.",
        "Itzy (Korean: 있지) is a South Korean girl group formed by JYP Entertainment, consisting of members Yeji, Lia, Ryujin, Chaeryeong, and Yuna. The group debuted on February 12, 2019, with the release of their single album, It'z Different.\n\nOn February 12, the group released their debut single album, It'z Different, with its lead single \"Dalla Dalla\". The song incorporates elements from EDM subgenres, such as future house and bass house. Its empowering lyrics have been well received by the audience. The group scored one of the biggest Billboard debuts for a new K-pop act in years, single \"Dalla Dalla\" entered at No. 3 and peaked at No. 2 on the World Digital Song Sales chart. The shape-shifting confidence anthem sold 2,000 downloads in the U.S. for the week ending February 14, according to Nielsen Music, making it the best-selling K-pop song in America that week. \"Want It?,\" released alongside the single \"Dalla Dalla,\" debuted at No. 8 selling 1,000 downloads. \"Dalla Dalla\" also debuted as the second most popular song on YouTube.",
        "Super Junior (Korean: 슈퍼주니어; Syupeo Junieo), also known as SJ or SuJu, is a South Korean boy band debuted on November 6, 2005, by producer Lee Soo-man of SM Entertainment. They are also dubbed by the media and Korean Music Awards as the \"King of Hallyu Wave\" due to their prominent contributions in Korean Wave. The group comprised a total of thirteen members at its peak. Super Junior originally debuted with twelve members, consisting of leader Leeteuk, Heechul, Hangeng, Yesung, Kangin, Shindong, Sungmin, Eunhyuk, Siwon, Donghae, Ryeowook, and Kibum. Kyuhyun joined the group later in 2006.\n\nSuper Junior launched into international recognition following the release of their best-selling single \"Sorry, Sorry\" in 2009, the title song of their most critically successful album, Sorry, Sorry. Over the years, they have been divided into smaller groups, simultaneously targeting different music industries and audiences. The members have also individually branched out into hosting, presenting and acting. Their successes and popularity as all-rounded entertainers have led other Korean entertainment managements to also begin training their music groups in other aspects of the entertainment industry.")

    private val kpopImages = intArrayOf(R.drawable.red_velvet,
        R.drawable.izone,
        R.drawable.bigbang,
        R.drawable.twice,
        R.drawable.blackpink,
        R.drawable.bts,
        R.drawable.cnblue,
        R.drawable.girls_generation,
        R.drawable.itzy,
        R.drawable.super_junior)

    val listData: ArrayList<Kpop>
        get() {
            val list = arrayListOf<Kpop>()
            for (position in kpopNames.indices) {
                val kpop = Kpop()
                kpop.name = kpopNames[position]
                kpop.detail = kpopDetails[position]
                kpop.photo = kpopImages[position]
                list.add(kpop)
            }
            return list
        }
}